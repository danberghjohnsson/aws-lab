_KEY=$1
_DNS=$2
scp -r -v -i $_KEY provision ubuntu@$_DNS:provision
