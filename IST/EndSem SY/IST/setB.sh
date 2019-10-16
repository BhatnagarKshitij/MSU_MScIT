#Question1
ls -R
echo "--------------------------------------------";
#Question2
wc -l < domestic/staff1
l1=`wc -l < domestic/staff1`

wc -l < domestic/staff1
l2=`wc -l < domestic/staff2`

wc -l < domestic/staff1
l3=`wc -l < foreign/staff1`

wc -l < domestic/staff1
l4=`wc -l < foreign/staff2`

echo "Lines in ds1 $l1"
echo "Lines in ds2 $l2"
echo "Lines in fs1 $l3"
echo "Lines in fs2 $l4"
echo "--------------------------------------------";
expr $l1 + $l2 + $l3 + $l4
echo "--------------------------------------------";
echo "--------------------------------------------";
#Question3
ls -l > wc
tr -s " " < wc > wc2
cut -d" " -f5,9 wc2
echo "--------------------------------------------";
