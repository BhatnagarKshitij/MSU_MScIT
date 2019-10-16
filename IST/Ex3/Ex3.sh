#Question1
echo "Enter Filename to know modification date";
read filename;
ls -l $filename;
echo "-----------------------------------------------------------------------";
#Question2
echo "Enter Complete Path of Directory: "
read path;
cd path;
echo "The Content of directory are : `ls`"
echo "-----------------------------------------------------------------------";
#Question3
echo "Enter Date in dd/mm/yyyy"
read setDate;
date -s $setDate
echo "The day on `date +%d` date is `date +%A`";
echo "-----------------------------------------------------------------------";
#Question4
echo "Enter File Name"
read filename;
wc -c $filename
echo "-----------------------------------------------------------------------";
#Question5
echo "Name of Opoerating System is `uname -o` and my Version is `uname --version` "
echo "-----------------------------------------------------------------------";
#Question6
#Question7
ls -1
ls -t
ls -S
ls -R
ls -r
echo "-----------------------------------------------------------------------";
#Question8
echo "January
Febuary
March
April
May
June
July
August
September
Octomber
November
December" > file1.txt
echo "-----------------------------------------------------------------------";
#Question9
head -n4 file1.txt
echo "-----------------------------------------------------------------------";
tail -n4 file1.txt
echo "-----------------------------------------------------------------------";
