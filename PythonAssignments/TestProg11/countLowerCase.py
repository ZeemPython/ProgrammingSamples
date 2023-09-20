str = input("enter a sentence: ")

lowercase_count = 0
lowercase_dict = dict()

for char in str:
     if char >= 'a' and char <= 'z' and not lowercase_dict.get(char):
        lowercase_dict.__setitem__(char, 1)
        lowercase_count += 1

print("number of different lower case letters found:", lowercase_count)