#Question1
expr 5 + 5;
#Question2
expr 5 - 5;
#Question3
expr 5 \* 5;
#Question4
expr 5 / 5;
#Question5
a=5;
b=5;
expr $a + $b
#Question6
a=5;
b=5;
expr $a - $b
#Question7
a=5;
b=5;
expr $a \* $b
#Question8
a=5;
b=5;
expr $a / $b
#Question9
str="Kshitij"
expr length $str;
#Question10
str="WELCOME";
expr index $str L
#Question11
echo "5.5 + 2.5" | bc
#Question12
echo "This is file1" > file1
echo "This is file2" > file2
diff file1 file2

