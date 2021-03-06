#!/bin/bash
# Should be run from repository's root
# Usage: bash .travis/docker_hub_push_releases.sh


if [ "$VULAS_RELEASE" != "$TRAVIS_TAG" ]; then
  echo '[-] VULAS_RELEASE and Git tag mismatch'
  echo "    VULAS_RELEASE: ${VULAS_RELEASE}"
  echo "    Git tag: ${TRAVIS_TAG}"
  exit 1
fi

echo "$DOCKER_HUB_NARAMSIM_PASSWORD" | docker login -u "$DOCKER_HUB_NARAMSIM_USERNAME" --password-stdin
if [ -z "$JIB" ]; then
  (cd docker && bash push-images.sh -r docker.io -p vulas -v "$TRAVIS_TAG")
else
  ./.travis/skaffold build -f ./.travis/skaffold.yaml
fi
