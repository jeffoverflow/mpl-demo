MPLPostStep('always') {
  echo "Build stage PostStep"
}

MPLModule('Maven Build', CFG)

echo "Build stage"

MPLModule('Test Build', CFG)