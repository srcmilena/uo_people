import math

num = int(input("Type a number to check if it is positive or negative: "))
if num > 0:
    countdown(num)
else:
    countup(num)


def countdown(num):  # negative
    if num <= 0:
        print('BLASTOFF!')
    else:
        print(num)
        countdown(1 - num)

        def countup(num):  # positive
            if num >= 0:
                print('BLASTOFF!')
            else:
                print(num)
                countdown(1 - num)


