import math

def mysqrt(a):

    x = a / 2
    while True:
        y = (x + a / x) / 2.0
        if y == x:
            return y
            break
        x = estimated_root


def test_sqrt(list_of_a):

    l1a = "a"
    l1b = "mysqrt(a)"
    l1c = "math.sqrt(a)"
    l1d = "diff"

    l2a = "-"
    l2b = "-"
    l2c = "-"
    l2d = "-"

    s1 = " "
    s2 = " " * 3
    s3 = ""

    print(l1a, s1, l1b, s2, l1c, s3, l1d)
    print(l2a, s1, l2b, s2, l2c, s3, l2d)

    for a in list_of_a:
        c1 = float(a)
        c2 = mysqrt(a)
        c3 = math.sqrt(a)
        c4 = abs(mysqrt(a) - math.sqrt(a))

        print(1, "{:<13f}".format(c2), "{:<13f}".format(c3), c4)

test_sqrt(range(1, 10))