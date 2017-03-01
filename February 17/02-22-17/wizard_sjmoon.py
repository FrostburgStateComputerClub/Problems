import time

def splitadd(num):
    num=str(num)
    if len(num)==1:
        return int(num)
    return splitadd(num[:len(num)//2]) + splitadd(num[len(num)//2:])    

in_file = open("nums.txt","r")

start = time.time()
prev_num=1
fact=1
for num_str in in_file:
    num = int(num_str)
    fact=1
    while num > 1:
        fact = fact*num
        num-=1
    prev_num=fact
    sum_of_digits = splitadd(fact)
    print(num_str[:-1],":",sum_of_digits)
duration = time.time() - start
print("Revised time:{0:.10f}".format(duration))
in_file.close()
