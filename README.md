# Transaction Blockchain System

## 📋 Overview
A Java-based blockchain-inspired transaction management system developed as part of the **Data Structures (CS210)** course at **Prince Sultan University**. This project implements a priority-based transaction system using max-heap and linked list data structures, designed specifically to work with HackerRank-style input/output for automated testing.

## 🎯 Course Information
- **Course**: Data Structures (CS210)
- **University**: Prince Sultan University
- **Purpose**: Implementation of heap and linked list data structures
- **Design**: Built for HackerRank-style input/output verification

## ✨ Features
- **Date-based transaction organization**: Transactions grouped by date (MMDDYYYY format)
- **Priority-based retrieval**: Max-heap implementation for efficient highest-value transaction retrieval
- **Linked list structure**: Chronological organization of transaction dates
- **HackerRank compatibility**: Designed for automated input/output testing
- **Command-line interface**: Simple interactive system with multiple operations

## 🏗️ Architecture

### Core Classes

#### 1. **Transaction**
Represents a single financial transaction with amount and transaction number.

#### 2. **MaxHeap**
Priority queue implementation that stores transactions in descending order of amount.

#### 3. **Node**
Represents a date in the blockchain with its associated transactions and heap structure.

#### 4. **NodeCoin**
Main blockchain structure that manages the linked list of dates and coordinates operations.

#### 5. **Solution**
Main class containing the command-line interface and program entry point.

## 🚀 Installation & Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Quick Setup
```bash
# Clone the repository
git clone https://github.com/yourusername/transaction-blockchain.git
cd transaction-blockchain

# Compile all Java files
javac *.java

# Run the program
java Solution
```

## 📖 Usage

### HackerRank-Compatible Input Format
The system accepts commands through standard input in the following format:
```
[command] [date] [optional: amount]
```

### Available Commands

| Command | Description | Format | Expected Output |
|---------|-------------|---------|-----------------|
| **1** | Insert transaction | `1 MMDDYYYY amount` | (no output) |
| **2** | Get & display max transaction | `2 MMDDYYYY` | `amount transactionNumber` or `-1` |
| **3** | Remove max transaction (silent) | `3 MMDDYYYY` | (no output) |
| **4** | Get all transactions & clear date | `4 MMDDYYYY` | All transactions (newline separated) or `-1` |

### Input/Output Examples

**Test Case 1:**
```
Input:
1 12012023 500.00
1 12012023 1200.50
1 12012023 300.25
2 12012023
4 12012023

Output:
1200.50 2
1200.50 2
500.00 1
300.25 3
```

**Test Case 2 (Error Handling):**
```
Input:
5 12012023 100.50  # Invalid command
2 01012000         # No transactions for this date

Output:
-1
-1
```

## 🧪 Testing with HackerRank

### Testing Method
The program is designed to be tested with HackerRank-style test cases. Input is provided via standard input, and output is validated against expected results.

### Sample Test File
Create a file `test_input.txt`:
```
1 01012023 150.75
1 01012023 89.50
1 02012023 200.00
2 01012023
2 02012023
4 01012023
```

Run the test:
```bash
java Solution < test_input.txt
```

### Expected Output:
```
150.75 2
200.00 1
150.75 2
89.50 1
```

## 📁 Project Structure
```
transaction-blockchain/
├── README.md
├── Solution.java        # Main class with HackerRank interface
├── Transaction.java     # Transaction data class
├── MaxHeap.java        # Max-heap implementation
├── Node.java          # Date node with transaction heap
├── NodeCoin.java      # Main blockchain structure
└── test_cases/        # Sample test cases
```

## 🛠️ Building and Running

### Compilation
```bash
# Compile all classes
javac *.java

# Or compile individually
javac Transaction.java MaxHeap.java Node.java NodeCoin.java Solution.java
```

### Running the Program
```bash
# Interactive mode
java Solution

# File input mode (HackerRank style)
java Solution < input.txt

# With output redirection
java Solution < input.txt > output.txt
```

## 🧮 Algorithm Complexity

| Operation | Time Complexity | Description |
|-----------|----------------|-------------|
| Insert Transaction | O(log n + m) | n = transactions per date, m = unique dates |
| Get Max Transaction | O(log n) | Heap restructuring |
| GetAll Transactions | O(n log n) | Heap sort + retrieval |
| Date Search | O(m) | Linear search through dates |

## 🔧 Technical Details

### Date Format Requirements
- Must be exactly 8 numeric characters (MMDDYYYY)
- Automatically padded with leading zeros
- Example: January 5, 2023 = `01052023`

### Transaction Numbering
- Each date starts transaction numbering at 1
- Auto-increments for each new transaction on that date
- Independent numbering per date

### Error Handling
- Returns `-1` for invalid operations or empty results
- Handles invalid commands gracefully (prints -1 and continues)
- Prevents heap overflow with capacity limits

## 🤝 Academic Context

This project was developed as part of the CS210 Data Structures course at Prince Sultan University to demonstrate:
- Practical implementation of max-heap data structure
- Linked list operations and management
- File I/O handling in Java
- Algorithm efficiency considerations
- Test-driven development with HackerRank-style validation

## 📄 License
This project is created for educational purposes as part of coursework at Prince Sultan University.

## 👤 Author
Hussam Aldossary - CS210 Student, Prince Sultan University

---
