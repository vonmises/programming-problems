# FEATURE PHONE KEY PRESSES
# LANGUAGE: PYTHON


# This is a feature phone keypad:

# ------- ------- -------
# |     | | ABC | | DEF |
# |  1  | |  2  | |  3  |
# ------- ------- -------
# ------- ------- -------
# | GHI | | JKL | | MNO |
# |  4  | |  5  | |  6  |
# ------- ------- -------
# ------- ------- -------
# |PQRS | | TUV | | WXYZ|
# |  7  | |  8  | |  9  |
# ------- ------- -------
# ------- ------- -------
# |     | |     | |     |
# |  *  | |  0  | |  #  |
# ------- ------- -------


# Before predictive text entry systems like T9, you had to press a button repeatedly to cycle through the possible values until you reached the one you wanted.
# For example, to type "V8" you would press the 8 key three times and then
# again four times (pressing the 8 key cycles through T->U->V->8), giving
# us a total of seven key presses.

# Note: the 0 key handles spaces and outputs 0 when tapped twice.

# Write a function that can calculate the amount of button presses
# required for any phrase. Except for spaces, punctuation can be ignored.
# Your function should accept both uppercase and lowercase letters and
# treat them the same.

# Examples:

# presses('V8') # 7
# presses('LOL') # 9
# presses('How R u 2day') # 23
# presses("i 8 2 Many mandazi 4 brekky") # 55

# Bonus: Try to avoid hard-coding the number of button presses for each letter!
# adgjmptw1  are 1
# behknqux0 are 2
# cfilorvy are 3
# 23456s8z are 4
# 79 are 5
# collect input
# separate and assign to variable
# check for letters
# add the total of numbers


# FEATURE PHONE KEY PRESSES
# LANGUAGE: PYTHON


# This is a feature phone keypad:

# ------- ------- -------
# |     | | ABC | | DEF |
# |  1  | |  2  | |  3  |
# ------- ------- -------
# ------- ------- -------
# | GHI | | JKL | | MNO |
# |  4  | |  5  | |  6  |
# ------- ------- -------
# ------- ------- -------
# |PQRS | | TUV | | WXYZ|
# |  7  | |  8  | |  9  |
# ------- ------- -------
# ------- ------- -------
# |     | |     | |     |
# |  *  | |  0  | |  #  |
# ------- ------- -------


# Before predictive text entry systems like T9, you had to press a button repeatedly to cycle through the possible values until you reached the one you wanted.
# For example, to type "V8" you would press the 8 key three times and then
# again four times (pressing the 8 key cycles through T->U->V->8), giving
# us a total of seven key presses.

# Note: the 0 key handles spaces and outputs 0 when tapped twice.

# Write a function that can calculate the amount of button presses
# required for any phrase. Except for spaces, punctuation can be ignored.
# Your function should accept both uppercase and lowercase letters and
# treat them the same.

# Examples:

# presses('V8') # 7
# presses('LOL') # 9
# presses('How R u 2day') # 23
# presses("i 8 2 Many mandazi 4 brekky") # 55

# Bonus: Try to avoid hard-coding the number of button presses for each letter!
# adgjmptw1  are 1
# behknqux0 are 2
# cfilorvy are 3
# 23456s8z are 4
# 79 are 5
# collect input
# separate and assign to variable
# check for letters
# add the total of numbers


def presses(str):

    chars1 = set('adgjmptw1 ')
    chars2 = set('behknqux0')
    chars3 = set('cfilorvy')
    chars4 = set('23456s8z')
    chars5 = set('79')


    str = str.lower()
    presses('V8')

    if any(i in chars1 for i in str):
    	total = 0
        total =  total + 1


    if any(i in chars2 for i in str):
        total =  total + 2

	if any(i in chars3 for i in str):
            total =  total + 3


	if any(i in chars4 for i in str):
            total =  total + 4


    if any(i in chars5 for i in str):
        total =  total + 5

    print total

