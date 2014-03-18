_KEY=$1
_DNS=$2
rsync -v -r -e "ssh -i $_KEY" java-on-ec2/ ubuntu@$_DNS:java-on-ec2
