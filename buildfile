define 'iso-21090-spike' do
  ISO_21090 = Dir[_('lib/iso-21090/*.jar')]
  compile.with ISO_21090
  run.using(:main=>'Main').with(ISO_21090)
end
