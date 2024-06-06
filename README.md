#                                                                              __Caesar Cipher Encoder/Decoder__

###  **Project Overview**

This project is a simple Caesar Cipher encoder and decoder written in Java. The Caesar Cipher is a basic encryption technique where each letter in the plaintext is shifted a certain number of places down or up the alphabet. This project uses separate packages for encoding and decoding functionalities.

### **Features**

Encode a given text using the Caesar Cipher technique. <br/>
Decode a given text encoded with the Caesar Cipher. <br/>
Customizable shift value (n). <br/>

### **Project Structure**

The project consists of the following packages and classes:

Encode.encode: Contains the encoding logic.		 <br/>		
Decode.decode: Contains the decoding logic.    <br/> 
run: The main class that provides a menu-driven interface for users.  <br/>

### **How It Works**

The CaesarCipher shifts each letter in the plaintext by a fixed number of positions down the alphabet. <br/>
For example, with a shift of 3:  <br/>
A becomes D  <br/>
B becomes E  <br/>
C becomes F <br/>
To decode, the process is reversed, shifting each letter in the ciphertext back by the same number of positions.

### **Usage**

#### **Encoding a Text**
To encode a text, you provide the plaintext and the shift value n. The program will output the encoded text.

#### **Decoding a Text**
You provide the encoded text and the shift value n to decode a text. The program will output the original plaintext.

### **How to Run**

#### **Clone the repository:**
	git clone https://github.com/your-username/caesar-cipher.git	
#### **Navigate to the project directory:**
	cd caesar-cipher
#### **Compile the Java files:**
	javac run.java Encode/encode.java Decode/decode.java
#### **Run the program:**
	java run

### **Contribution**

Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

### **Acknowledgements**

This project is based on the classic Caesar Cipher encryption technique.
