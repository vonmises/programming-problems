#Using python, have the function SwapCase(str) take the str parameter
#and swap the case of each character.
#For example: if str is "Hello World" the output should be hELLO wORLD.
#Let numbers and symbols stay the way they are.

#NB do not use the swapcase python method.

def swap_case(str):
    return "".join([char.lower() if char.isupper() else char.upper() for char in str])

print(swap_case("othEr"))