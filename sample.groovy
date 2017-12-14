def prep(){
stage('prep'){
  print 'x'
}
}

def build(){
stage('build'){
  print 'build'
}
}
def unittest(){
stage('tests'){
  parallel(
    'code analyze':{print 'a'},
    'unit tests':{print 'b'})
}
}
return this
