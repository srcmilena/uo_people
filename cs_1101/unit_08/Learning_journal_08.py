# 1. How to format each dictionary item as a text string in the input file.

import csv

def readFile():

    myDic="myDictionary.txt"

    dictionary={}

    with open(myDic) as csv_file:

        csv_reader = csv.reader(csv_file, delimiter=',')

        for row in csv_reader:

            key=row[0]

            value=row[1]

            dictionary[key]=value

        return dictionary


def invert_dict(x):
    inverse = dict()

    for key1 in x.keys():
        list_items = x.get(key1)

        inverse[list_items] = key1

    return inverse


def printResultToFile(data):
    fileMyResult = open("myResult.txt", "w")

    for key in data:
        fileMyResult.write(key + "," + data[key] + "\n")

    fileMyResult.close()


data = readFile()

data = invert_dict(data)

printResultToFile(data)

print(readFile())