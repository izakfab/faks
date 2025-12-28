#! /bin/bash
if [ $# -ne 1 ]; then
	x=1
else
	x=$1
fi

max=0
sum=0
errs=0

for ((i = 0; i < x; i++)); do

	T=$(./random.sh 4)
	N=$(./random.sh 100)
	K=$(./random.sh $N)
	M=0

	if [ $T -eq 1 ]; then
	M=$(./random.sh $(./stKomb.sh $N $K))
	elif [ $T -eq 2 ]; then
	M=$(./random.sh $(./stKombSPon.sh $N $K))
	elif [ $T -eq 3 ]; then
	M=$(./random.sh $(./stVar.sh $N $K))
	elif [ $T -eq 4 ]; then
	M=$(./random.sh $(./stVarSPon.sh $N $K))
	fi

	echo "$T $N $K $M"

	start=$(date +%s%N)
	echo "$T $N $K $M" | java Tekm_63250060 > /dev/null
	end=$(date +%s%N)
	time=$((($end-$start)/1000000))
	sum=$((sum+$time))
	if [ $time -gt $max ]; then
		max=$time
	fi
	if [ $time -gt 900 ]; then
		echo "$T $N $K $M ---> $time ms" >> error.txt
		errs=$((errs+1))
	fi
	echo "$time ms"
	if [ $# -ne 0 ]; then
		echo ""
		echo "$(($i + 1))/$x"
	fi
	echo ""

done

echo "Max: $max ms"
echo "Avg: $((sum/x)) ms"
echo "Errors: $errs"
echo "Total: $(($sum/3600000)) h $((($sum/60000)%60)) min $((($sum/1000)%60)) s $((($sum)%1000)) ms for $x tests"

echo "Max: $max ms" >> history.txt
echo "Avg: $((sum/x)) ms" >> history.txt
echo "Errors: $errs" >> history.txt
echo "Total: $(($sum/3600000)) h $((($sum/60000)%60)) min $((($sum/1000)%60)) s $((($sum)%1000)) ms for $x tests" >> history.txt
echo "" >> history.txt
