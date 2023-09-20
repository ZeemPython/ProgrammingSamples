# First4Last4
# write a program called First4Last4.
# ask user for a string
# read string from user
# print true if the first four characters of string (from left to right) equal the last 4 characters of the string (from right to left)
# if the string is too short (less than 8 chars) return false
# HINT: if x = "hello", then x[0] is 'h', x[1] is 'e'

str = input("enter string: ")

#if string is greater than 8 char
if len(str) >= 8:

    first = (str[0])
    second = (str[1])
    third = (str[2])
    fouth = (str[3])

    fourthToLast = (str[len(str) - 4])
    thirdToLast = (str[len(str) - 3])
    secondToLast = (str[len(str) - 2])
    last = (str[len(str) - 1])

    if first == last and second == secondToLast and third == thirdToLast and fouth == fourthToLast:
        print("True")
    else:
        print("False")

#if string is lower than 8 char
else:
    print("string is too short")