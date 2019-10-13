#Question 1
mkdir MSc_1
#Question 2
cd MSc_1
#Question 3
pwd
#Question 4
mkdir Shell_Prog
#Question 5
cd Shell_Prog
#Question 6
touch student_list
echo "Kshitij
Harsh
Parth
Juned
Soyab
Joy
Harshil
Vishal
Aka Romaricq Junior
" >> student_list
#Question 7
echo "Word COunt `wc -cwl student_list`"
#Question 8
cp student_list student_list_backup
#Question 9
cp student_list /student_list
#Question 10
cal
#Question 11
cal JAN 2004
#Question 12
date +%D%A%T
#Question 13
echo "Todays date is `+%d/%m/%y`"
#Question 14
echo "Todays Day is `date +%a`"
#Question 15
echo "Today day is `date +%d`"
#Question 16
echo "Current Time is `date +%T`"
#Question 17
echo "Eyes
Nose
Teeth
Mouth
" >> Biology

echo "Zinc
Cobalt
Mercury
Copper
" >> Chemistry

echo "Light
Temperature
force
acceleration
" >> Physics

echo "Addition
Subtration
Multiplication
Division
" >> Mathematics
#Question 18
cat Mathematics Physics Chemistry Biology > Science
#Question 19
echo "This size in character of File BIOLOGY are `wc -c Biology`"
echo "This size in character of File CHEMISTRY are `wc -c Chemistry`"
echo "This size in character of File PHYSICS are `wc -c Physics`"
echo "This size in character of File MATHEMATICS are `wc -c Mathematics`"
echo "The Total number of Lines in all four files are `wc -l Science`"
echo "The Total number of Words in all four files are `wc -w Science`"
echo "The Total number of Character in all four files are `wc -c Science`"
#Question 20
wc -cwl Science > Summery_input
#Question 21
pwd
#Question 22
uname -o
#Question 23
mv Summery_input final_summery
#Question 24
cp Biology Chemistry Physics Mathematics /root
#Question 25
touch prog1.txt prog2.txt prog3.txt prog4.txt prog5.doc prog6.doc data1.doc data2.doc data3.doc data4.doc record1 record2 record3 record4
#Question 26
ls prog*
#Question 27
ls data*
#Question 28
ls *txt
#Question 29
ls *doc
#Question 30
ls *2
#Question 31
ls *1
#Question 32
ls *3
#Question 33
ls *{1,2,3}
#Question 34
ls *{1,2,3,4}
#Question 35
ls *{doc,txt}
#Question 36
ls *[^txt]
ls *[!t][!x][!t]
#Question 37
ps
#Question 38
ls *[!0-9]
ls *[^0-9]
