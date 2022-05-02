alphabet = "abcdefghijklmnopqrstuvwxyz"
test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"]
test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"]
def histogram(s):
    d = dict()
    for c in s:
        if c not in d:
            d[c] = 1
        else:
            d[c] += 1
    return d

# Part 1
def has_duplicates(stringP):
    dictionary = histogram(stringP)
    for key,value in dictionary.items():
        if value > 1:
            return True
    return False

print("# has_duplicates fuction")
for sTr in test_dups:
    if has_duplicates(sTr):
        print(sTr +": it has duplicates")
    else:
        print(sTr+": it has no duplicates")

# Part 2
def missing_letters(sTr):
    missingLettersList = []
    dictionary = histogram(sTr)
    for l in alphabet:
        if l not in dictionary:
            missingLettersList.append(l)
    missingLettersList.sort()
    return "".join(missingLettersList)
    print("missing_letters fuction")
    for lTm in test_miss:
        sTr = missing_letters(lTm.replace(" ",""))
        if sTr!="":
            print(lTm+": missing letters "+sTr)
    else:
        print(lTm +": has all the letters")