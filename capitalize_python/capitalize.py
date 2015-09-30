# Using ruby, have the function capitalize(str) take the str parameter being passed and capitalize
# the first letter of each word. Words will be separated by only one space.
# it should take string input from a user
# do not use the capitalize method

def capitalise(text):
    return " ".join([word[0].upper() + word[1:] for word in text.split()])

print(capitalise("some words here"))