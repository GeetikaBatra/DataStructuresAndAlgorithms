# assuming characters in teh string are lower case
# Find if string has unique character

#Bitwise operation
def find_unique(string1):
    checker = 0
    for each in string1:
        val = ord(each) - ord('a')
 
        if((checker & (1<<val))>0):
            return False

        checker |= (1<<val)

    return True

print(find_unique("kjhfdkk"))

#using List indices
def list_implemetation(string2):
    u_list = []
    for i in range(0, 128):
        u_list.append(0)
    
    for each in string2:
        if u_list[ord(each)] > 0:
            return False

        u_list[ord(each)] = 1

    return True

print(list_implemetation("yes"))


