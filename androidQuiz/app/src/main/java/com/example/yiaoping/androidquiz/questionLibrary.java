package com.example.yiaoping.androidquiz;

/**
 * Created by Yiaoping on 11/7/2018.
 */

public class questionLibrary {
    private String mQuestions[] = {
            "1. What is the content of the stack pointer?",
            "2. What does the code segment contain?",
            "3. What does int 80h command mean?",
            "4. What does this do if ebx and eax = 0? \n cmp ebx, 5; jg loop_end; add eax, ebx; inc ebx; jmp loop_start",
            "5. Assembly language programs are written using",
            "6. How many bytes are in a double word?",
            "7. What is the value of EAX register after executing: \n MOV EAX,456h, CMP EAX,456h",
            "8. mov eax, [n1 + 8]. \n\n EAX contains which of the following",
            "9. What does the stack segment contain?",
            "10. What does this do if ebx and eax = 0? cmp ebx, 5; jg loop_end; add eax, ebx; inc ebx; jmp loop_start",
            "11. The PUSH instruction will: ",
            "12. The POP instruction will: ",
            "13. Which of the following is false of ESP:",
            "14. Which of the following is false of the stack:",
            "15. How are input parameters NOT passed to functions?",
            "16. Which of the following is false of EBP:",
            "17. Which of the following is the fastest?",
            "18. What does the following do?\n start_while: CMP EAX, EBX; jge end_while; jump start_while",
            "19. Add ebx, [eax]; add eax, 5; inc ebx; imul ebx, eax\n" +
                    "What is EBX if values of eax = 3, ebx = 2",
            "20. Which of the following is false of intermediate addressing?",
            "FINISHED"

    };

    private String mChoices [][]={
            {"address of current instruction","address of next instruction","address of top element of stack","none of the above"},
            {"Data, constants","Work area","Instructions to be executed","Return addresses"},
            {"Overflow error","Interrupt generated to Linux system call","Register command","None of the above"},
            {"Goes to loop_end after 5 times","Goes to loop_start after 5 times","Infinite loop","None of the above"},
            {"hex code","mnenonics","ascii code","none of the above"},
            {"1","4","8","16"},
            {"456h","Zero","Unknown","None of the above"},
            {"Address at n1","Value of n1","Address at n1+8","Value of n1+8"},
            {"Data, constants","Work area","Instructions to be executed","Return addresses"},
            {"Goes to loop_end after 5 times","Goes to loop_start after 5 times","Infinite loop","None of the above"},
            {"Add an element to the collection", "Remove the most recent element", "Remove the first element that", "Do nothing"},
            {"Add an element to the collection", "Remove the most recent element", "Remove the first element that", "Do nothing"},
            {"Points to location of last thing pushed onto the stack", "Does not move even as push or pops occur", "Can be used to place temporary variables", "Current position on the stack"},
            {"It is located in memory in RAM", "It's located in the stack segment register", "Grows first in last out", "Used for dynamic memory allocation"},
            {"By registers","Pushed onto the stack","FIFO", "All of the above"},
            {"Used to go back to the base of the stack", "Used to point to the current position of the stack", "Used to get local variables", "Used to get input parameters"},
            {"Stack", "Memory variables", "Register", "Hard Drive"},
            {"If EAX is greater than EBX, go to end_while", "Always stays in start_while", "If EAX is greater than or equal to EBX, go to end_while", "If EBX is greater than or equal to EAX, go to end_while"},
            {"18", "42", "35", "21"},
            {"Data has a constant value, or an expression","First operand defines the length of the data", "First operand is typically register or memory location", "The register provided contains the data"},
            {"","","",""}
    };

    private String mCorrectAnswers [] = {
            "address of current instruction",
            "Instructions to be executed",
            "Interrupt generated to Linux system call",
            "Goes to loop_end after 5 times",
            "mnenonics",
            "4",
            "456h",
            "Value of n1+8",
            "Return addresses",
            "Goes to loop_end after 5 times",
            "Add an element to the collection",
            "Remove the most recent element",
            "Does not move even as push or pops occur",
            "Used for dynamic memory allocation",
            "FIFO",
            "Used to point to the current position of the stack",
            "Register",
            "If EAX is greater than or equal to EBX, go to end_while",
            "42",
            "The register provided contains the data",
            "Finished"
    };

    public String getQuestions (int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
