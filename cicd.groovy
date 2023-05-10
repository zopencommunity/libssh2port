node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/libssh2port.git'), string(name: 'PORT_DESCRIPTION', value: 'libssh2 is a client-side C library implementing the SSH2 protocol' )]
  }
}
