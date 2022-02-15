{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 25,
   "id": "66083acd",
   "metadata": {},
   "outputs": [],
   "source": [
    "import numpy as np\n",
    "import scipy.special\n",
    "import matplotlib.pyplot as plt\n",
    "\n",
    "%matplotlib inline\n",
    "\n",
    "# 신경망 클래스 정의\n",
    "class NeuralNetwork:\n",
    "    \n",
    "    # 신경망 초기화 함수 정의\n",
    "    # 필요 요소: 입력 계층의 노드, 은닉 계층의 노드, 출력 계층의 노드\n",
    "    def __init__(self, input_nodes, hidden_nodes, output_nodes, learning_rate):\n",
    "        # 입력, 은닉, 출력 계층의 노드 개수 설정\n",
    "        self.inodes = input_nodes\n",
    "        self.hnodes = hidden_nodes\n",
    "        self.onodes = output_nodes\n",
    "        \n",
    "        \n",
    "        # 가중치 매트릭스 wih(w,inputhidden)와 who(w, hiddenoutput)\n",
    "        self.wih = np.random.normal(0.0, pow(self.hnodes, -0.5), (self.hnodes, self.inodes))\n",
    "        self.who = np.random.normal(0.0, pow(self.onodes, -0.5), (self.onodes, self.hnodes))\n",
    "        \n",
    "        \n",
    "        # 학습률\n",
    "        self.lr = learning_rate\n",
    "        \n",
    "        \n",
    "        # 활성화 함수 정의 (parameter로 x를 받고 expit 함수 argument로 전달 expit는 sigmoid function 연산 수행)\n",
    "        # 익명 함수로 정의\n",
    "        self.activation_function = lambda x: scipy.special.expit(x)\n",
    "        \n",
    "        pass\n",
    "    \n",
    "    \n",
    "    # 신경망 트레이닝 함수 정의\n",
    "    def train(self, inputs_list, targets_list):\n",
    "        \n",
    "        # 입력 리스트를 2차원 행렬로 변환\n",
    "        inputs = np.array(inputs_list, ndmin=2).T\n",
    "        targets = np.array(targets_list, ndmin=2).T\n",
    "        \n",
    "        # 은닉 계층으로 들어오는 신호를 계산\n",
    "        hidden_inputs = np.dot(self.wih, inputs)\n",
    "        # 은닉 계층에서 나가는 신호 계산\n",
    "        hidden_outputs = self.activation_function(hidden_inputs)\n",
    "        \n",
    "        # 최종 출력 계층으로 들어오는 신호 게산\n",
    "        final_inputs = np.dot(self.who, hidden_outputs)\n",
    "        # 최종 출력 계층으로 나가는 신호 계산\n",
    "        final_outputs = self.activation_function(final_inputs)\n",
    "        \n",
    "        # 오차 계산 (실제 값 - 계산 값)\n",
    "        output_errors = targets - final_outputs\n",
    "        \n",
    "        # 은닉 계층의 오차는 가중치에 의해 나뉜 출력 계층의 오차들을 재조합해 계산\n",
    "        hidden_errors = np.dot(self.who.T, output_errors)\n",
    "        \n",
    "        # 은닉 계층과 출력 계층 간의 가중치 업데이트\n",
    "        self.who += self.lr * np.dot((output_errors * final_outputs * (1.0 - final_outputs)), np.transpose(hidden_outputs))\n",
    "        \n",
    "        # 은닉 계층과 입력 계층 간의 가중치 업데이트\n",
    "        self.wih += self.lr * np.dot((hidden_errors * hidden_outputs * (1.0 - hidden_outputs)), np.transpose(inputs))\n",
    "        pass\n",
    "    \n",
    "    \n",
    "    # 신경망에 질의하는 함수 정의\n",
    "    def query(self, inputs_list):\n",
    "        \n",
    "        # 입력된 리스트를 2차원 행렬로 변환\n",
    "        # ndim: Dimention 정의(2차원) \n",
    "        inputs = np.array(inputs_list, ndmin=2).T\n",
    "        \n",
    "        # 은닉 계층으로 들어오는 신호 계산( dot 함수는 행렬곱 연산 수행)\n",
    "        hidden_inputs = np.dot(self.wih, inputs)\n",
    "        # 은닉 계층에서 나가는 신호 계산(sigmoid function 활용)\n",
    "        hidden_outputs = self.activation_function(hidden_inputs)\n",
    "        \n",
    "        # 최종 출력 계층으로 들어오는 신호 계산\n",
    "        final_inputs = np.dot(self.who, hidden_outputs)\n",
    "        # 최종 출력 계층에서 나가는 신호 계산(sigmoid function 활용)\n",
    "        final_outputs = self.activation_function(final_inputs)\n",
    "        \n",
    "        return final_outputs\n",
    "        \n",
    "    \n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 28,
   "id": "1507175b",
   "metadata": {},
   "outputs": [],
   "source": [
    "# 입력, 은닉, 출력 노드의 수\n",
    "# 손글씨 숫자 이미지 픽셀 28 x 28 매트릭스 == input nodes가 784개로 형성\n",
    "input_nodes = 784\n",
    "hidden_nodes = 100\n",
    "output_nodes = 10\n",
    "\n",
    "# 학습률\n",
    "learning_rate = 0.3\n",
    "\n",
    "# 신경망 인스턴스 생성\n",
    "n = NeuralNetwork(input_nodes, hidden_nodes, output_nodes, learning_rate)\n",
    "\n",
    "# mnist dataset load\n",
    "traning_data_file = open(\"./mnist_dataset/mnist_train_100.csv\", \"r\")\n",
    "traning_data_list = traning_data_file.readlines()\n",
    "traning_data_file.close()\n",
    "\n",
    "# 신경망 트레이닝\n",
    "\n",
    "# epochs는 학습 데이터가 학습을 위해 사용되는 횟수\n",
    "epochs = 5\n",
    "\n",
    "# 학습 데이터 모음 내 모든 레코드 탐색\n",
    "for e in range(epochs):\n",
    "    for record in traning_data_list:\n",
    "        all_values = record.split(',')\n",
    "        inputs = (np.asfarray(all_values[1:]) / 255.0 * 0.99) + 0.01\n",
    "        targets = np.zeros(output_nodes) + 0.01\n",
    "        targets[int(all_values[0])] = 0.99\n",
    "        n.train(inputs, targets)\n",
    "        pass\n",
    "    pass\n",
    "\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 31,
   "id": "293ec070",
   "metadata": {},
   "outputs": [],
   "source": [
    "test_data_file = open('./mnist_dataset/mnist_test.csv', 'r')\n",
    "test_data_list = test_data_file.readlines()\n",
    "test_data_file.close()\n",
    "\n",
    "# 신경망 테스트\n",
    "\n",
    "# 성적표 초기화\n",
    "scorecard = []\n",
    "\n",
    "for record in test_data_list:\n",
    "    all_values = record.split(',')\n",
    "    correct_label = int(all_values[0])\n",
    "    inputs = (np.asfarray(all_values[1:]) / 255.0 * 0.99) + 0.01\n",
    "    outpus = n.query(inputs)\n",
    "    label = np.argmax(outpus)\n",
    "    if (label == correct_label):\n",
    "        scorecard.append(1)\n",
    "    else:\n",
    "        scorecard.append(0)\n",
    "        pass\n",
    "    pass\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 32,
   "id": "fb1ac97e",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Performanc =  0.6624\n"
     ]
    }
   ],
   "source": [
    "# 정답의 비율인 성적을 계산하여 출력\n",
    "scorecard_array = np.asarray(scorecard)\n",
    "print(f\"Performanc =  {scorecard_array.sum() / scorecard_array.size}\")"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 33,
   "id": "3a9312ea",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "7\n"
     ]
    }
   ],
   "source": [
    "# 성능은 약 66% \n",
    "all_values = test_data_list[0].split(',')\n",
    "print(all_values[0])"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 34,
   "id": "edc8a8ea",
   "metadata": {},
   "outputs": [
    {
     "data": {
      "text/plain": [
       "<matplotlib.image.AxesImage at 0x7fdd24719d90>"
      ]
     },
     "execution_count": 34,
     "metadata": {},
     "output_type": "execute_result"
    },
    {
     "data": {
      "image/png": "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\n",
      "text/plain": [
       "<Figure size 432x288 with 1 Axes>"
      ]
     },
     "metadata": {
      "needs_background": "light"
     },
     "output_type": "display_data"
    }
   ],
   "source": [
    "image_array = np.asfarray(all_values[1:]).reshape((28, 28))\n",
    "plt.imshow(image_array, cmap=\"Greys\", interpolation=\"None\")"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 36,
   "id": "94192237",
   "metadata": {},
   "outputs": [
    {
     "data": {
      "text/plain": [
       "array([[0.04218486],\n",
       "       [0.00249377],\n",
       "       [0.02718413],\n",
       "       [0.03621494],\n",
       "       [0.00774132],\n",
       "       [0.03977874],\n",
       "       [0.00819694],\n",
       "       [0.94413346],\n",
       "       [0.00608438],\n",
       "       [0.01571534]])"
      ]
     },
     "execution_count": 36,
     "metadata": {},
     "output_type": "execute_result"
    }
   ],
   "source": [
    "n.query((np.asfarray(all_values[1:]) / 255.0 * 0.99) + 0.01)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "ec0e3bab",
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3 (ipykernel)",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.8.10"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}
