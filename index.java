import random

# Create the array
my_array = [1, 2, 3, 4, 5, 6, 7]

# Shuffle the array
random.shuffle(my_array)

print(my_array)
def roman_to_int(roman_numeral):
    roman_dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    result = 0
    prev_value = 0

    for numeral in reversed(roman_numeral):
        value = roman_dict[numeral]
        if value < prev_value:
            result -= value
        else:
            result += value
        prev_value = value

    return result

roman_numeral = input("Enter a Roman numeral: ")
integer_value = roman_to_int(roman_numeral)
print(f"The integer value of {roman_numeral} is {integer_value}")
Check if the input is a pangram or not:
python
Copy code
import string

def is_pangram(input_string):
    alphabet = set(string.ascii_lowercase)
    input_string = input_string.lower()
    return set(input_string) >= alphabet

input_sentence = input("Enter a sentence: ")
if is_pangram(input_sentence):
    print("The input is a pangram.")
else:
    print("The input is not a pangram.")





