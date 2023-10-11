# Read from the file file.txt and output the tenth line to stdout.
#!/bin/bash
file="file.txt"
lineNum=0 # no spaces near the equal sign while assigning value to a variable
while read -r line; do
    # lineNum=$(($lineNum+1))
    lineNum=$[$lineNum+1] # no spaces around the assignment sign
    if [[ $lineNum -eq 10 ]]
    then
        echo -e "$line"
    fi
done <$file 