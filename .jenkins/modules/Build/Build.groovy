MPLPostStep('always') {
  echo "Build stage PostStep"
}

MPLModule('Build', CFG)

echo "Build stage"

MPLModule('Test Build', CFG)