#!/bin/bash

CURPATH=$(pwd)
TARGET_CLASSES_PATH="target/classes/lib/linux-aarch64"
TARGET_PATH="target"

exitWithError() {
  cd ${CURPATH}
  echo "*** An error occurred. Please check log messages. ***"
  exit $1
}

mkdir -p "$TARGET_CLASSES_PATH"

cd "$TARGET_PATH"
cmake -DCMAKE_BUILD_TYPE=RELEASE ../../../ || exitWithError $?
make || exitWithError $?
rm -f "$CURPATH/${TARGET_CLASSES_PATH}/libbrotli.so"
cp "./libbrotli.so" "$CURPATH/${TARGET_CLASSES_PATH}" || exitWithError $?

cd "${CURPATH}"