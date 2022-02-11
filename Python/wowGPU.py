#!/usr/bin/env python
# coding: utf-8

# In[6]:


import torch
print(torch.cuda.is_available())
print(torch.cuda.device_count())
print(torch.cuda.get_device_name(torch.cuda.current_device()))


# In[7]:


from torch import cuda
assert cuda.is_available()
assert cuda.device_count() > 0
print(cuda.get_device_name(cuda.current_device()))


# In[10]:


from tensorflow.python.client import device_lib
print(device_lib.list_local_devices())


# In[12]:


import tensorflow as tf
tf.config.list_physical_devices('CPU')
tf.config.list_physical_devices('GPU')


# In[13]:


tf.config.experimental.list_physical_devices('GPU')


# In[14]:


tf.debugging.set_log_device_placement(True)
a = tf.constant([[1.0, 2.0, 3.0], [4.0, 5.0, 6.0]])
b = tf.constant([[1.0, 2.0], [3.0, 4.0], [5.0, 6.0]])
c = tf.matmul(a, b)
print(c)


# In[21]:


print(len(tf.config.experimental.list_physical_devices('GPU')))


# In[ ]:




