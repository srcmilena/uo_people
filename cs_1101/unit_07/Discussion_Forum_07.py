
list_1 = [20, 25, 30]
list_2 = [40, 45, 50]
zip1 = list(zip(list_1, list_2))

print('Zip and type:  ', type(zip1))
for c, d in zip1:
    print(c, d)