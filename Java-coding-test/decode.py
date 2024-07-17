def decode(message_file):
    # Step 1: Read the file and parse its contents
    with open(message_file, 'r') as file:
        lines = file.readlines()
    
    # Parse lines into a list of (number, word) tuples
    word_dict = {}
    for line in lines:
        number, word = line.strip().split()
        word_dict[int(number)] = word
    
    # Step 2: Determine the structure of the pyramid and identify key indices
    # The key indices are the last elements of each line in the pyramid
    key_indices = []
    level = 1
    current_num = 1
    while current_num <= max(word_dict.keys()):
        end_of_line = current_num + level - 1
        key_indices.append(end_of_line)
        current_num = end_of_line + 1
        level += 1
    
    # Step 3: Extract the corresponding words and form the decoded message
    decoded_message = ' '.join(word_dict[index] for index in key_indices if index in word_dict)
    
    return decoded_message

# Example usage:
# Assuming you have a file named 'message.txt' with the given content
print(decode('message.txt'))

