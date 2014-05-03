cat /tmp/danbjson.tmp.App.out.txt | grep ^Thread | cut -f 4 -d " " | sort | uniq
