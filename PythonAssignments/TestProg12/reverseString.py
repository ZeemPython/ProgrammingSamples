def reverse(s):
    if len(s) == 0:
        return
    else:
        reverse(s[1:])
        print(s[0], end="")

reverse(input("enter a string: "))
