#!/usr/bin/env groovy

import org.apache.commons.lang.StringUtils
ines (5 sloc)  226 Bytes
  
def clone(String branch_name,String Url) {
  echo "$branch_name"
  echo "$Url"
  git 'https://github.com/rkgithub2020/spring3hibernate-1.git'
  
}
