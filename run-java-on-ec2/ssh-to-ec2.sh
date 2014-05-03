_KEY=${KEY:-$1}
_DNS=${DNS:-$2}
ssh -i $_KEY ubuntu@$_DNS
