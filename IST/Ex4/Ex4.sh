#Question1
ls -1
ls -t
ls -S
ls -R
ls -r
echo "--------------------------------------------------";
#Question
echo "January
February
March
April
May
June
July
August
September
October
November
December" > file1.txt
echo "--------------------------------------------------";
#Question2
head -n4 file1.txt
echo "--------------------------------------------------";
#Question3
tail -n3 file1.txt
echo "--------------------------------------------------";
#Question4
tail -n +4 file1.txt

#Question5
head -n -5 file1.txt

#Question6
tail -n +3 file1.txt|head -n 5 >file2.txt

#Question9a
cut -d" " -f1,2 data.txt > file1.txt

#Question9b
cut -d" " -f4-6 data.txt >file2.txt

#Question9c
paste file1.txt file2.txt

#Question9d
cut -d" " -f2 file1.txt|sort

#Question9e
cut -d" " -f2 file1.txt|sort -r

#Question9f

