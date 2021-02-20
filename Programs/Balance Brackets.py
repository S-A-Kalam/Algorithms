def Brackets(exp):
    stack=[]
    for char in exp:
        if char in ["(","[","{"]:
            stack.append(char)
        else:
            if not stack:
                return False
            curr_char=stack.pop()
            if curr_char=='(':
                if char!=')':
                    return False    
            if curr_char=='[':
                if char!=']':
                    return False
            if curr_char=='{':
                if char!='}':
                    return False                            
    if stack:
        return False
    return True
if __name__=="__main__":
    expression=input("Enter string")
    if Brackets(expression):
        print("Balanced") 
    else:
        print("Not balanced")           