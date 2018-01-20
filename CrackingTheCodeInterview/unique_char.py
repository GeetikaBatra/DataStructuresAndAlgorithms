# assuming characters in teh string are lower case
# Find if string has unique character

def find_unique(string1):
    checker = 0
    for each in string1:
        val = ord(each) - ord('a')
 
        if((checker & (1<<val))>0):
            return False

        checker |= (1<<val)

    return True

print(find_unique("kjhfdkk"))