#!/bin/bash

workspace="/Users/ethender/Developer/eclipseworkspace/sp"
gitPath="/Users/ethender/Developer/Git/sp"


#sudo -s rm -r "${gitPath}/*"
#cp -r "${workspace}" "${gitPath}"

if [ -d $gitPath ]
then
    echo "directory path found deleting the source directories."
    cd $gitPath
    pwd
    sudo -s rm -r build
    sudo -s rm -r src
    sudo -s rm -r target
    sudo -s rm -r WebContent
    sudo -s rm -r pom.xml
    echo "directories deleted."
    cp -r $workspace/build .
    cp -r $workspace/src .
    cp -r $workspace/target .
    cp -r $workspace/WebContent .
    cp -r $workspace/pom.xml .
    echo "directories copied"
    #clear
    echo "Please git update it make changes."
else
   clear
   echo "Directory doesnt exists"
   echo "Please check once again"

fi

cd $gitPath


