def call(String url, String branch){
  echo "Code"
  git url: "${url}", branch: "${branch}"
  echo "Code cloning successful"
}
