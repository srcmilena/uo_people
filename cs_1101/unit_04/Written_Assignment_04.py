# Functions definitions
# Gets two arguments
# Where d1 = divisible 1; d2 = divisible 2; p1 = power 1; p2 = power 2
# p1 is power of p2 if p1/p2

def is_divisible(d1, d2):
    return d1 % d2 == 0

def is_power(p1, p2):

# Conditionals
# Checking numbers

# If returns true: p1 = p2

    if p1 == 1:
        return True
    else:
        if p2 == 1:
            return False
        else:

# Determining if numbers are power

            return is_divisible(p1,p2) and is_power(p1//p2, p2)

# Output

print("is_power(10, 2) returns: ", is_power(10, 2))
print("is_power(27, 3) returns: ", is_power(27, 3))
print("is_power(1, 1) returns: ", is_power(1, 1))
print("is_power(10, 1) returns: ", is_power(10, 1))
print("is_power(3, 3) returns: ", is_power(3, 3))
