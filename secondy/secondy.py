# Using Python, have the function Secondy(lis) take the list of numbers stored in lis
# and return the second lowest and second greatest numbers, respectively, separated by a space.
# For example: if lis contains [7, 7, 12, 98, 106] the output should be 12 98.
# The list will not be empty and will contain at least 2 numbers. It can get tricky if there's just two numbers!

def Secondy(lis):
    numbers = sorted(set(lis))

    if len(numbers) == 2:
        return numbers[1], numbers[0]
    else:
        return numbers[1], numbers[-2]

print(Secondy([7, 7, 7, 98, 12, 12, 8, 106]))
