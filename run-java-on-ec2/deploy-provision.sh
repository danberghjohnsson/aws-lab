KEY=$1
DNS=$2
scp -r -v -i $KEY provision ubuntu@$DNS:provision
