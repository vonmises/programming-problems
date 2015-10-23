 # Using PYTHON solve the problem below:

 # Remove duplicate characters in a given string keeping only the first occurrences. 
 # For example, if the input is ‘tree traversal’ the output will be "tre avsl".

def removeDuplicates(string):
    chars = []

    [chars.append(c) for c in string if c not in chars]

    return "".join(chars)

print(removeDuplicates("tree traversal"))
