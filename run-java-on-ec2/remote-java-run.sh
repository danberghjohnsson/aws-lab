_KEY=$1
_DNS=$2
ssh -i $_KEY ubuntu@$_DNS "(cd java-on-ec2; sh scripts/mvn-exec-java.sh)"
