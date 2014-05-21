_KEY=${KEY:-$1}
_DNS=${DNS:-$2}
rsync -v -r -e "ssh -i $_KEY" ec2-user@$DNS:mc-server-20140424/world /tmp
