import sys

sentence = sys.stdin.readline()

while sentence != ".\n":
  strr = []
  flag = 0
  for s in sentence:
    if s == '[' or s == '(':
      strr.append(s)
    if s == ']':
      if len(strr) == 0 or strr.pop() != '[':
        print("no")
        flag = 1
        break
    if s == ')':
      if len(strr) == 0 or strr.pop() != '(':
        print("no")
        flag = 1
        break
    if s == '.':
      if len(strr) == 0:
        print("yes")
      else:
        print("no")
      break
  sentence = sys.stdin.readline()
  