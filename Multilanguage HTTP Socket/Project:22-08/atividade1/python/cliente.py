#coding: UTF-8

import socket
import getpass

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

s.connect(('10.3.3.33',1234))
print s.recv(1024)

s.close()

