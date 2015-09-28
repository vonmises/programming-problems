# Write a function that return whether or not the input string has balanced parantheses
# Balanced:
#   '((()))'
#   '(()())'
# Not balanced:
#   '((()'
#   '())('

def is_paren_balanced(str):
    balanced = True
    index = 0
    stack = []

    while index < len(str) and balanced:
        char = str[index]
        if char == "(":
            stack.append(char)
        elif char == ")":
            if len(stack) == 0:
                balanced = False
            else:
                stack.pop()

        index += 1

    return balanced and len(stack) == 0

print(is_paren_balanced('(a(b(c)d)e)'))