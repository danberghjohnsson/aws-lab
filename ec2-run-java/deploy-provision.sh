_KEY=${KEY:-$1}
_DNS=${DNS:-$2}
scp -r -i $_KEY provision ubuntu@$_DNS:provision
