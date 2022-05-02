def add(num1, num2):
    # Returns num1 plus num2.
    return num1 + num2


def sub(num1, num2):
    # Returns num1 minus num2.
    return num1 - num2


def mul(num1, num2):
    # Returns num1 times num2.
    return num1 * num2


def div(num1, num2):
    # Returns num1 divided by num2.
    return num1 / num2


def main():
    num1 = int(input("What is the number 1?"))
    num2 = int(input("What is the number 2?"))

    operation = input("What do you want to do? (add, subtract, multiply and divide)")

    if operation == 'add':
        print(add(num1, num2))
    elif operation == 'subtract':
        print(sub(num1, num2))
    elif operation == 'multiply':
        print(mul(num1, num2))
    elif operation == 'divide':
        print(div(num1, num2))
    else:
        print("I don't understand")
